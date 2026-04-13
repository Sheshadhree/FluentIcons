package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pen28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pen28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.289f, 3.15f)
            curveToRelative(1.535f, -1.536f, 4.025f, -1.536f, 5.56f, 0f)
            curveToRelative(1.536f, 1.535f, 1.536f, 4.025f, 0f, 5.56f)
            lineToRelative(-1.54f, 1.54f)
            curveToRelative(1.223f, 1.273f, 1.207f, 3.295f, -0.046f, 4.548f)
            lineTo(21.28f, 16.78f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(1.982f, -1.983f)
            curveToRelative(0.667f, -0.667f, 0.683f, -1.74f, 0.047f, -2.426f)
            lineTo(10.063f, 23.497f)
            curveToRelative(-0.44f, 0.44f, -0.987f, 0.76f, -1.587f, 0.928f)
            lineToRelative(-5.524f, 1.547f)
            curveToRelative(-0.26f, 0.073f, -0.54f, 0f, -0.732f, -0.192f)
            curveToRelative(-0.192f, -0.191f, -0.265f, -0.471f, -0.192f, -0.732f)
            lineToRelative(1.547f, -5.525f)
            curveToRelative(0.167f, -0.6f, 0.487f, -1.146f, 0.928f, -1.586f)
            lineTo(19.288f, 3.15f)
            close()
        }
    }.build()
}
