package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DeviceEq16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeviceEq16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(10.5f)
            curveTo(8.75f, 13.664f, 8.414f, 14f, 8f, 14f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(2.75f)
            curveTo(7.25f, 2.336f, 7.586f, 2f, 8f, 2f)
            close()
            moveToRelative(2.75f, 2f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(10f, 11.664f, 10f, 11.25f)
            verticalLineToRelative(-6.5f)
            curveTo(10f, 4.336f, 10.336f, 4f, 10.75f, 4f)
            close()
            moveTo(6f, 4.75f)
            curveTo(6f, 4.336f, 5.664f, 4f, 5.25f, 4f)
            reflectiveCurveTo(4.5f, 4.336f, 4.5f, 4.75f)
            verticalLineToRelative(6.5f)
            curveTo(4.5f, 11.664f, 4.836f, 12f, 5.25f, 12f)
            reflectiveCurveTo(6f, 11.664f, 6f, 11.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveTo(13.75f, 6f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(13f, 9.664f, 13f, 9.25f)
            verticalLineToRelative(-2.5f)
            curveTo(13f, 6.336f, 13.336f, 6f, 13.75f, 6f)
            close()
            moveTo(3f, 6.75f)
            curveTo(3f, 6.336f, 2.664f, 6f, 2.25f, 6f)
            reflectiveCurveTo(1.5f, 6.336f, 1.5f, 6.75f)
            verticalLineToRelative(2.5f)
            curveTo(1.5f, 9.664f, 1.836f, 10f, 2.25f, 10f)
            reflectiveCurveTo(3f, 9.664f, 3f, 9.25f)
            verticalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
