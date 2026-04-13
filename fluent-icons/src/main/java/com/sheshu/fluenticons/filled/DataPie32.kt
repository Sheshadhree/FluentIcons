package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataPie32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataPie32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.31f, 3.288f)
            curveTo(17.507f, 3.1f, 17.774f, 3f, 18.047f, 3.013f)
            curveToRelative(5.916f, 0.277f, 10.663f, 5.024f, 10.94f, 10.94f)
            curveToRelative(0.013f, 0.273f, -0.086f, 0.54f, -0.275f, 0.737f)
            curveToRelative(-0.189f, 0.198f, -0.45f, 0.31f, -0.724f, 0.31f)
            horizontalLineTo(18f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(4.012f)
            curveToRelative(0f, -0.274f, 0.112f, -0.535f, 0.31f, -0.724f)
            close()
            moveToRelative(-2.62f, 3f)
            curveTo(14.888f, 6.477f, 15f, 6.738f, 15f, 7.012f)
            verticalLineTo(14.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7.488f)
            curveToRelative(0.274f, 0f, 0.535f, 0.112f, 0.724f, 0.31f)
            curveToRelative(0.189f, 0.197f, 0.288f, 0.464f, 0.275f, 0.737f)
            curveTo(25.701f, 24.145f, 20.668f, 29f, 14.5f, 29f)
            curveTo(8.149f, 29f, 3f, 23.851f, 3f, 17.5f)
            curveTo(3f, 11.332f, 7.855f, 6.299f, 13.953f, 6.013f)
            curveTo(14.226f, 6f, 14.493f, 6.1f, 14.69f, 6.288f)
            close()
        }
    }.build()
}
