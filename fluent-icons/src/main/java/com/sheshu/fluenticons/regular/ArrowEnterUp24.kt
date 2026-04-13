package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowEnterUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowEnterUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 21.25f)
            curveToRelative(0f, 0.415f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(10.679f, 22f, 9f, 20.323f, 9f, 18.25f)
            verticalLineTo(4.587f)
            lineToRelative(-3.72f, 3.72f)
            curveToRelative(-0.266f, 0.266f, -0.683f, 0.29f, -0.976f, 0.072f)
            lineTo(4.22f, 8.306f)
            curveTo(3.953f, 8.039f, 3.93f, 7.623f, 4.147f, 7.329f)
            lineTo(4.22f, 7.245f)
            lineToRelative(5f, -5f)
            curveToRelative(0.266f, -0.266f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineToRelative(0.084f, 0.073f)
            lineToRelative(5f, 5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.291f, -0.976f, 0.073f)
            lineTo(14.22f, 8.306f)
            lineToRelative(-3.72f, -3.72f)
            verticalLineToRelative(13.665f)
            curveToRelative(0f, 1.19f, 0.925f, 2.165f, 2.096f, 2.244f)
            lineToRelative(0.154f, 0.006f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.335f, 0.75f, 0.75f)
            close()
        }
    }.build()
}
