package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnDownLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnDownLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.28f, 16.78f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-4f, -4f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(4f, -4f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(6.56f, 11.5f)
            horizontalLineTo(13f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(3.75f)
            curveTo(14.5f, 3.336f, 14.836f, 3f, 15.25f, 3f)
            reflectiveCurveTo(16f, 3.336f, 16f, 3.75f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6.56f)
            lineToRelative(2.72f, 2.72f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            close()
        }
    }.build()
}
