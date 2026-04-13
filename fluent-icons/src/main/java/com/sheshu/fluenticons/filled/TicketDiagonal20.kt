package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TicketDiagonal20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TicketDiagonal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.735f, 2.53f)
            curveToRelative(-0.683f, -0.683f, -1.791f, -0.683f, -2.475f, 0f)
            lineToRelative(-7.732f, 7.732f)
            curveToRelative(-0.683f, 0.684f, -0.683f, 1.792f, 0f, 2.475f)
            lineToRelative(0.775f, 0.775f)
            curveTo(3.71f, 13.92f, 4.29f, 13.85f, 4.65f, 13.652f)
            curveToRelative(0.177f, -0.097f, 0.38f, -0.152f, 0.6f, -0.152f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            curveToRelative(0f, 0.218f, -0.056f, 0.421f, -0.153f, 0.599f)
            curveToRelative(-0.197f, 0.36f, -0.267f, 0.939f, 0.14f, 1.346f)
            lineToRelative(0.774f, 0.774f)
            curveToRelative(0.684f, 0.684f, 1.792f, 0.684f, 2.475f, 0f)
            lineToRelative(7.733f, -7.732f)
            curveToRelative(0.683f, -0.683f, 0.683f, -1.791f, 0f, -2.475f)
            lineToRelative(-0.776f, -0.775f)
            curveToRelative(-0.406f, -0.406f, -0.985f, -0.337f, -1.345f, -0.14f)
            curveToRelative(-0.179f, 0.098f, -0.382f, 0.153f, -0.6f, 0.153f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            curveToRelative(0f, -0.218f, 0.055f, -0.422f, 0.152f, -0.599f)
            curveToRelative(0.197f, -0.36f, 0.267f, -0.94f, -0.14f, -1.346f)
            lineTo(12.736f, 2.53f)
            close()
        }
    }.build()
}
