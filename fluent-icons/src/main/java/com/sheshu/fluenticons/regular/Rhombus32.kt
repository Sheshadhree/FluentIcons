package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Rhombus32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Rhombus32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.506f, 7.043f)
            curveTo(8f, 5.809f, 9.195f, 5f, 10.524f, 5f)
            horizontalLineToRelative(17.153f)
            curveToRelative(2.3f, 0f, 3.871f, 2.322f, 3.017f, 4.457f)
            lineToRelative(-6.2f, 15.5f)
            curveTo(24.001f, 26.191f, 22.806f, 27f, 21.477f, 27f)
            horizontalLineTo(4.323f)
            curveToRelative(-2.299f, 0f, -3.871f, -2.322f, -3.017f, -4.457f)
            lineToRelative(6.2f, -15.5f)
            close()
            moveTo(10.524f, 7f)
            curveToRelative(-0.512f, 0f, -0.971f, 0.311f, -1.161f, 0.786f)
            lineToRelative(-6.2f, 15.5f)
            curveTo(2.834f, 24.106f, 3.439f, 25f, 4.323f, 25f)
            horizontalLineToRelative(17.154f)
            curveToRelative(0.511f, 0f, 0.97f, -0.311f, 1.16f, -0.786f)
            lineToRelative(6.2f, -15.5f)
            curveTo(29.166f, 7.894f, 28.561f, 7f, 27.677f, 7f)
            horizontalLineTo(10.524f)
            close()
        }
    }.build()
}
