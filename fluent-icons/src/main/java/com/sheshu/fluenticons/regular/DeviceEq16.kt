package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DeviceEq16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DeviceEq16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(11f)
            curveTo(8.5f, 13.776f, 8.276f, 14f, 8f, 14f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-11f)
            curveTo(7.5f, 2.224f, 7.724f, 2f, 8f, 2f)
            close()
            moveToRelative(2.5f, 2f)
            curveTo(10.776f, 4f, 11f, 4.224f, 11f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 11.776f, 10f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(10f, 4.224f, 10.224f, 4f, 10.5f, 4f)
            close()
            moveTo(6f, 4.5f)
            curveTo(6f, 4.224f, 5.776f, 4f, 5.5f, 4f)
            reflectiveCurveTo(5f, 4.224f, 5f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(5f, 11.776f, 5.224f, 12f, 5.5f, 12f)
            reflectiveCurveTo(6f, 11.776f, 6f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(13.5f, 6f)
            curveTo(13.776f, 6f, 14f, 6.224f, 14f, 6.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(13f, 9.776f, 13f, 9.5f)
            verticalLineToRelative(-3f)
            curveTo(13f, 6.224f, 13.224f, 6f, 13.5f, 6f)
            close()
            moveTo(3f, 6.5f)
            curveTo(3f, 6.224f, 2.776f, 6f, 2.5f, 6f)
            reflectiveCurveTo(2f, 6.224f, 2f, 6.5f)
            verticalLineToRelative(3f)
            curveTo(2f, 9.776f, 2.224f, 10f, 2.5f, 10f)
            reflectiveCurveTo(3f, 9.776f, 3f, 9.5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
