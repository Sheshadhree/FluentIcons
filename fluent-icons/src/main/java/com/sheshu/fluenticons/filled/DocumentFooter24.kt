package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentFooter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentFooter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.746f, 1.996f)
            curveToRelative(1.19f, 0f, 2.166f, 0.925f, 2.245f, 2.096f)
            lineToRelative(0.005f, 0.154f)
            verticalLineToRelative(15.498f)
            curveToRelative(0f, 1.191f, -0.925f, 2.166f, -2.096f, 2.245f)
            lineToRelative(-0.154f, 0.005f)
            horizontalLineToRelative(-11.5f)
            curveToRelative(-1.19f, 0f, -2.166f, -0.925f, -2.245f, -2.096f)
            lineToRelative(-0.005f, -0.154f)
            verticalLineTo(4.246f)
            curveToRelative(0f, -1.19f, 0.925f, -2.166f, 2.096f, -2.245f)
            lineToRelative(0.154f, -0.005f)
            horizontalLineToRelative(11.5f)
            close()
            moveTo(8.501f, 16f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            curveToRelative(0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.829f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            curveToRelative(0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
