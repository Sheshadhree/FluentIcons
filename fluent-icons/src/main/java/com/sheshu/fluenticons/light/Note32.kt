package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Note32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Note32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 3f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineToRelative(17f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineToRelative(8.843f)
            curveToRelative(1.194f, 0f, 2.338f, -0.474f, 3.182f, -1.318f)
            lineToRelative(8.157f, -8.157f)
            curveTo(28.526f, 18.681f, 29f, 17.537f, 29f, 16.343f)
            verticalLineTo(7.5f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineToRelative(-17f)
            close()
            moveTo(4f, 7.5f)
            curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
            horizontalLineToRelative(17f)
            curveTo(26.433f, 4f, 28f, 5.567f, 28f, 7.5f)
            verticalLineToRelative(8.843f)
            curveToRelative(0f, 0.222f, -0.021f, 0.442f, -0.062f, 0.657f)
            horizontalLineTo(21.5f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            verticalLineToRelative(6.438f)
            curveTo(16.785f, 27.978f, 16.565f, 28f, 16.343f, 28f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
            verticalLineToRelative(-17f)
            close()
            moveToRelative(14f, 20.083f)
            verticalLineTo(21.5f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(6.083f)
            curveToRelative(-0.16f, 0.298f, -0.364f, 0.574f, -0.608f, 0.818f)
            lineToRelative(-8.157f, 8.157f)
            curveToRelative(-0.244f, 0.244f, -0.52f, 0.448f, -0.818f, 0.608f)
            close()
        }
    }.build()
}
