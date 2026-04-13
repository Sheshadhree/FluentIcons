package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoClipOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClipOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(0.702f, 0.702f)
            curveTo(2.352f, 4.568f, 2f, 5.368f, 2f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.358f, 0f, 0.702f, -0.058f, 1.024f, -0.165f)
            lineToRelative(0.945f, 0.945f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveToRelative(9.837f, 11.957f)
            lineToRelative(-2.635f, 1.45f)
            curveTo(9.816f, 15.992f, 9f, 15.51f, 9f, 14.75f)
            verticalLineToRelative(-4.69f)
            lineToRelative(4.117f, 4.117f)
            close()
            moveToRelative(2.364f, -3.053f)
            curveToRelative(0.564f, 0.31f, 0.668f, 1.027f, 0.312f, 1.487f)
            lineToRelative(6.071f, 6.072f)
            curveTo(21.953f, 18.387f, 22f, 18.074f, 22f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
            horizontalLineTo(6.182f)
            lineToRelative(6.688f, 6.688f)
            lineToRelative(2.612f, 1.436f)
            close()
        }
    }.build()
}
