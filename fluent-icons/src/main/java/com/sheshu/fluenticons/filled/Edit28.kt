package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Edit28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Edit28",
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
            lineToRelative(-5.56f, -5.56f)
            lineToRelative(1.54f, -1.54f)
            close()
            moveToRelative(-2.6f, 2.6f)
            lineTo(4.502f, 17.937f)
            curveToRelative(-0.44f, 0.44f, -0.76f, 0.986f, -0.928f, 1.586f)
            lineToRelative(-1.547f, 5.525f)
            curveToRelative(-0.073f, 0.26f, 0f, 0.54f, 0.192f, 0.732f)
            curveToRelative(0.191f, 0.192f, 0.471f, 0.265f, 0.732f, 0.192f)
            lineToRelative(5.524f, -1.547f)
            curveToRelative(0.6f, -0.168f, 1.147f, -0.487f, 1.587f, -0.928f)
            lineTo(22.25f, 11.311f)
            lineToRelative(-5.56f, -5.56f)
            close()
        }
    }.build()
}
