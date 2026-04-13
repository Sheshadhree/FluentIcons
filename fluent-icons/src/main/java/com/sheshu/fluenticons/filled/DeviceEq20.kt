package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DeviceEq20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeviceEq20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(2.75f)
            curveTo(9.25f, 2.336f, 9.586f, 2f, 10f, 2f)
            close()
            moveToRelative(3.75f, 3f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(13f, 14.664f, 13f, 14.25f)
            verticalLineToRelative(-8.5f)
            curveTo(13f, 5.336f, 13.336f, 5f, 13.75f, 5f)
            close()
            moveTo(7f, 5.75f)
            curveTo(7f, 5.336f, 6.664f, 5f, 6.25f, 5f)
            reflectiveCurveTo(5.5f, 5.336f, 5.5f, 5.75f)
            verticalLineToRelative(8.5f)
            curveTo(5.5f, 14.664f, 5.836f, 15f, 6.25f, 15f)
            reflectiveCurveTo(7f, 14.664f, 7f, 14.25f)
            verticalLineToRelative(-8.5f)
            close()
            moveTo(17.25f, 8f)
            curveTo(17.664f, 8f, 18f, 8.336f, 18f, 8.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-2.5f)
            curveTo(16.5f, 8.336f, 16.836f, 8f, 17.25f, 8f)
            close()
            moveTo(3.5f, 8.75f)
            curveTo(3.5f, 8.336f, 3.164f, 8f, 2.75f, 8f)
            reflectiveCurveTo(2f, 8.336f, 2f, 8.75f)
            verticalLineToRelative(2.5f)
            curveTo(2f, 11.664f, 2.336f, 12f, 2.75f, 12f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
