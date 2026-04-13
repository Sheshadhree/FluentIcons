package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowReplyDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowReplyDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.56f, 8f)
            lineToRelative(2.22f, -2.22f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(4.56f, 9.5f)
            horizontalLineToRelative(3.69f)
            curveTo(11.426f, 9.5f, 14f, 6.926f, 14f, 3.75f)
            curveTo(14f, 3.336f, 13.664f, 3f, 13.25f, 3f)
            reflectiveCurveTo(12.5f, 3.336f, 12.5f, 3.75f)
            curveTo(12.5f, 6.097f, 10.597f, 8f, 8.25f, 8f)
            horizontalLineTo(4.56f)
            close()
        }
    }.build()
}
