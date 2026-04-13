package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.207f, 12.267f)
            curveToRelative(-0.286f, -0.3f, -0.274f, -0.775f, 0.026f, -1.06f)
            lineToRelative(5.25f, -5.002f)
            curveToRelative(0.29f, -0.276f, 0.745f, -0.276f, 1.035f, 0f)
            lineToRelative(5.25f, 5.001f)
            curveToRelative(0.3f, 0.286f, 0.312f, 0.76f, 0.026f, 1.06f)
            curveToRelative(-0.286f, 0.3f, -0.76f, 0.312f, -1.06f, 0.026f)
            lineTo(10f, 7.784f)
            lineToRelative(-4.734f, 4.508f)
            curveToRelative(-0.3f, 0.286f, -0.774f, 0.275f, -1.06f, -0.025f)
            close()
        }
    }.build()
}
