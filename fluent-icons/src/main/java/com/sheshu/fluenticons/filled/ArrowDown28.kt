package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDown28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDown28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.712f, 15.703f)
            curveToRelative(0.388f, -0.393f, 0.384f, -1.026f, -0.009f, -1.414f)
            curveToRelative(-0.392f, -0.389f, -1.026f, -0.385f, -1.414f, 0.008f)
            lineToRelative(-7.288f, 7.376f)
            verticalLineTo(3.998f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            curveToRelative(-0.553f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(17.673f)
            lineToRelative(-7.287f, -7.374f)
            curveTo(5.326f, 13.904f, 4.693f, 13.9f, 4.3f, 14.29f)
            curveToRelative(-0.393f, 0.388f, -0.397f, 1.021f, -0.008f, 1.414f)
            lineToRelative(8.82f, 8.927f)
            curveToRelative(0.49f, 0.495f, 1.29f, 0.495f, 1.779f, 0f)
            lineToRelative(8.821f, -8.927f)
            close()
        }
    }.build()
}
