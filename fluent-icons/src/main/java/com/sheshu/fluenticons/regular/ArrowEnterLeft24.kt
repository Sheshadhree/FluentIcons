package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowEnterLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowEnterLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.25f, 4f)
            curveTo(21.666f, 4f, 22f, 4.336f, 22f, 4.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 2.071f, -1.678f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(4.587f)
            lineToRelative(3.72f, 3.72f)
            curveToRelative(0.266f, 0.266f, 0.29f, 0.683f, 0.072f, 0.976f)
            lineTo(8.306f, 19.78f)
            curveToRelative(-0.267f, 0.267f, -0.683f, 0.29f, -0.977f, 0.073f)
            lineTo(7.245f, 19.78f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.266f, -0.266f, -0.29f, -0.683f, -0.073f, -0.976f)
            lineToRelative(0.073f, -0.084f)
            lineToRelative(5f, -5f)
            curveToRelative(0.293f, -0.293f, 0.768f, -0.293f, 1.06f, 0f)
            curveToRelative(0.267f, 0.266f, 0.291f, 0.683f, 0.073f, 0.976f)
            lineTo(8.306f, 9.78f)
            lineToRelative(-3.72f, 3.72f)
            horizontalLineToRelative(13.665f)
            curveToRelative(1.19f, 0f, 2.165f, -0.925f, 2.244f, -2.096f)
            lineToRelative(0.006f, -0.154f)
            verticalLineToRelative(-6.5f)
            curveTo(20.5f, 4.336f, 20.836f, 4f, 21.25f, 4f)
            close()
        }
    }.build()
}
