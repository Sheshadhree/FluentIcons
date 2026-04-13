package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TagLockAccent16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagLockAccent16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.648f, 1.954f)
            lineToRelative(-4.76f, 4.728f)
            curveToRelative(-0.59f, 0.586f, -0.59f, 1.534f, 0f, 2.12f)
            lineToRelative(3.31f, 3.287f)
            curveTo(5.686f, 12.574f, 6.424f, 12.66f, 7f, 12.344f)
            verticalLineTo(10f)
            curveToRelative(0f, -0.932f, 0.637f, -1.715f, 1.5f, -1.937f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            curveToRelative(0.343f, 0f, 0.673f, 0.058f, 0.98f, 0.164f)
            lineToRelative(0.016f, -2.153f)
            curveToRelative(0.006f, -0.832f, -0.674f, -1.515f, -1.52f, -1.511f)
            lineTo(7.714f, 1.514f)
            curveToRelative(-0.4f, 0.001f, -0.783f, 0.16f, -1.065f, 0.44f)
            close()
        }
    }.build()
}
