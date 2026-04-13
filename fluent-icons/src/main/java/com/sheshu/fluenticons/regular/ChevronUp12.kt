package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronUp12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronUp12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.147f, 7.354f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineTo(6f, 4.207f)
            lineToRelative(3.146f, 3.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.512f, 0f, -0.708f)
            lineToRelative(-3.5f, -3.5f)
            curveToRelative(-0.195f, -0.195f, -0.511f, -0.195f, -0.707f, 0f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            close()
        }
    }.build()
}
