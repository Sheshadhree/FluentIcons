package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowLeft28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowLeft28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.298f, 4.289f)
            curveToRelative(0.393f, -0.388f, 1.026f, -0.385f, 1.415f, 0.008f)
            curveToRelative(0.388f, 0.393f, 0.384f, 1.026f, -0.009f, 1.414f)
            lineTo(6.328f, 13f)
            horizontalLineToRelative(17.675f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(6.33f)
            lineToRelative(7.374f, 7.286f)
            curveToRelative(0.393f, 0.389f, 0.397f, 1.022f, 0.009f, 1.415f)
            curveToRelative(-0.389f, 0.392f, -1.022f, 0.396f, -1.415f, 0.008f)
            lineToRelative(-8.927f, -8.821f)
            curveToRelative(-0.495f, -0.49f, -0.495f, -1.289f, 0f, -1.778f)
            lineToRelative(8.927f, -8.821f)
            close()
        }
    }.build()
}
