package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DeviceEq20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DeviceEq20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-15f)
            curveTo(9.5f, 2.224f, 9.724f, 2f, 10f, 2f)
            close()
            moveToRelative(3.5f, 3f)
            curveTo(13.776f, 5f, 14f, 5.224f, 14f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(13f, 14.776f, 13f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(13f, 5.224f, 13.224f, 5f, 13.5f, 5f)
            close()
            moveTo(7f, 5.5f)
            curveTo(7f, 5.224f, 6.776f, 5f, 6.5f, 5f)
            reflectiveCurveTo(6f, 5.224f, 6f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(6f, 14.776f, 6.224f, 15f, 6.5f, 15f)
            reflectiveCurveTo(7f, 14.776f, 7f, 14.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(16.5f, 8f)
            curveTo(16.776f, 8f, 17f, 8.224f, 17f, 8.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(16f, 11.776f, 16f, 11.5f)
            verticalLineToRelative(-3f)
            curveTo(16f, 8.224f, 16.224f, 8f, 16.5f, 8f)
            close()
            moveTo(4f, 8.5f)
            curveTo(4f, 8.224f, 3.776f, 8f, 3.5f, 8f)
            reflectiveCurveTo(3f, 8.224f, 3f, 8.5f)
            verticalLineToRelative(3f)
            curveTo(3f, 11.776f, 3.224f, 12f, 3.5f, 12f)
            reflectiveCurveTo(4f, 11.776f, 4f, 11.5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
