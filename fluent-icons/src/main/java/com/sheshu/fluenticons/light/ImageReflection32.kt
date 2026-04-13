package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ImageReflection32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ImageReflection32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 9f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveTo(4f, 6.5f)
            curveTo(4f, 4.015f, 6.015f, 2f, 8.5f, 2f)
            horizontalLineToRelative(15f)
            curveTo(25.985f, 2f, 28f, 4.015f, 28f, 6.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 1.741f, -0.99f, 3.252f, -2.436f, 4f)
            curveTo(27.01f, 25.248f, 28f, 26.759f, 28f, 28.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(27f, 29.776f, 27f, 29.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.742f, 0f, 1.43f, -0.23f, 1.996f, -0.625f)
            lineToRelative(-8.435f, -8.436f)
            curveToRelative(-0.586f, -0.585f, -1.536f, -0.585f, -2.122f, 0f)
            lineToRelative(-8.435f, 8.436f)
            curveTo(7.07f, 23.77f, 7.758f, 24f, 8.5f, 24f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.776f, 25f, 10.5f, 25f)
            horizontalLineToRelative(-2f)
            curveTo(6.567f, 25f, 5f, 26.567f, 5f, 28.5f)
            verticalLineToRelative(1f)
            curveTo(5f, 29.776f, 4.776f, 30f, 4.5f, 30f)
            reflectiveCurveTo(4f, 29.776f, 4f, 29.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.741f, 0.99f, -3.252f, 2.436f, -4f)
            curveTo(4.99f, 23.752f, 4f, 22.241f, 4f, 20.5f)
            verticalLineToRelative(-14f)
            close()
            moveToRelative(1.772f, 16.193f)
            lineToRelative(8.46f, -8.46f)
            curveToRelative(0.977f, -0.977f, 2.56f, -0.977f, 3.536f, 0f)
            lineToRelative(8.46f, 8.46f)
            curveTo(26.711f, 22.093f, 27f, 21.33f, 27f, 20.5f)
            verticalLineToRelative(-14f)
            curveTo(27f, 4.567f, 25.433f, 3f, 23.5f, 3f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 3f, 5f, 4.567f, 5f, 6.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 0.83f, 0.289f, 1.593f, 0.772f, 2.193f)
            close()
            moveTo(17.5f, 24f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 25f, 17.5f, 25f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}
