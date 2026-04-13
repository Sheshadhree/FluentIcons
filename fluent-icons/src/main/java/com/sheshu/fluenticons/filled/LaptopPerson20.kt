package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LaptopPerson20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LaptopPerson20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 5f)
            curveTo(3.672f, 5f, 3f, 5.672f, 3f, 6.5f)
            verticalLineToRelative(6f)
            curveTo(3f, 13.328f, 3.672f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(0.413f, -0.55f, 1.049f, -0.925f, 1.773f, -0.99f)
            curveToRelative(-0.48f, -0.532f, -0.773f, -1.237f, -0.773f, -2.01f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            curveToRelative(0.546f, 0f, 1.059f, 0.146f, 1.5f, 0.401f)
            verticalLineTo(6.5f)
            curveTo(17f, 5.672f, 16.328f, 5f, 15.5f, 5f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(-2f, 10f)
            horizontalLineToRelative(8.55f)
            curveTo(11.017f, 15.162f, 11f, 15.329f, 11f, 15.5f)
            curveToRelative(0f, 0.167f, 0.013f, 0.334f, 0.038f, 0.5f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 16f, 2f, 15.776f, 2f, 15.5f)
            reflectiveCurveTo(2.224f, 15f, 2.5f, 15f)
            close()
            moveToRelative(15f, -4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(1.5f, 4.5f)
            curveToRelative(0f, 1.245f, -1f, 2.5f, -3.5f, 2.5f)
            reflectiveCurveTo(12f, 16.75f, 12f, 15.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
