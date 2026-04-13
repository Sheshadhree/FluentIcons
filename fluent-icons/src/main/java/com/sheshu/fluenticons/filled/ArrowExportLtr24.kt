package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowExportLtr24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExportLtr24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 4.504f)
            curveToRelative(0.38f, 0f, 0.693f, 0.282f, 0.743f, 0.648f)
            lineTo(3.5f, 5.254f)
            verticalLineToRelative(13.499f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.693f, -0.283f, -0.743f, -0.649f)
            lineTo(2f, 18.753f)
            verticalLineToRelative(-13.5f)
            curveToRelative(0f, -0.413f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveToRelative(12.46f, 1.883f)
            lineToRelative(0.083f, -0.094f)
            curveToRelative(0.36f, -0.36f, 0.928f, -0.388f, 1.32f, -0.083f)
            lineToRelative(0.094f, 0.083f)
            lineToRelative(4.997f, 4.998f)
            curveToRelative(0.36f, 0.36f, 0.388f, 0.927f, 0.083f, 1.32f)
            lineToRelative(-0.083f, 0.093f)
            lineToRelative(-4.996f, 5.004f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.391f, -1.415f, 0f)
            curveToRelative(-0.36f, -0.36f, -0.388f, -0.927f, -0.084f, -1.32f)
            lineToRelative(0.083f, -0.094f)
            lineTo(18.581f, 13f)
            horizontalLineTo(6f)
            curveToRelative(-0.513f, 0f, -0.936f, -0.386f, -0.993f, -0.883f)
            lineTo(5f, 12f)
            curveToRelative(0f, -0.513f, 0.386f, -0.935f, 0.883f, -0.993f)
            lineTo(6f, 11f)
            horizontalLineToRelative(12.584f)
            lineToRelative(-3.291f, -3.293f)
            curveToRelative(-0.36f, -0.36f, -0.388f, -0.928f, -0.083f, -1.32f)
            lineToRelative(0.083f, -0.094f)
            lineToRelative(-0.083f, 0.094f)
            close()
        }
    }.build()
}
