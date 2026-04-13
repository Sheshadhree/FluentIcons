package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StyleGuide20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StyleGuide20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.819f, 17.259f)
            curveToRelative(0.073f, 0.271f, 0.187f, 0.52f, 0.335f, 0.74f)
            horizontalLineTo(6.998f)
            curveToRelative(-1.104f, 0f, -2f, -0.895f, -2.001f, -2f)
            lineToRelative(-0.005f, -5.535f)
            lineTo(6.82f, 17.26f)
            close()
            moveTo(4f, 16.499f)
            curveToRelative(0f, 0.152f, 0.014f, 0.301f, 0.04f, 0.446f)
            lineTo(3.984f, 16.93f)
            curveToRelative(-1.067f, -0.286f, -1.7f, -1.383f, -1.416f, -2.45f)
            lineToRelative(1.426f, -5.34f)
            lineTo(4f, 16.5f)
            close()
            moveToRelative(3.655f, 0.018f)
            curveToRelative(0.287f, 1.067f, 1.384f, 1.7f, 2.451f, 1.414f)
            lineToRelative(5.416f, -1.451f)
            curveToRelative(1.067f, -0.286f, 1.7f, -1.383f, 1.413f, -2.45f)
            lineTo(14.099f, 3.483f)
            curveToRelative(-0.287f, -1.067f, -1.384f, -1.7f, -2.451f, -1.414f)
            lineToRelative(-5.416f, 1.45f)
            curveToRelative(-1.067f, 0.286f, -1.7f, 1.382f, -1.413f, 2.449f)
            lineToRelative(2.836f, 10.55f)
            close()
            moveTo(9f, 6.25f)
            curveTo(9f, 6.664f, 8.664f, 7f, 8.25f, 7f)
            reflectiveCurveTo(7.5f, 6.664f, 7.5f, 6.25f)
            curveToRelative(0f, -0.415f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(9f, 5.835f, 9f, 6.25f)
            close()
        }
    }.build()
}
