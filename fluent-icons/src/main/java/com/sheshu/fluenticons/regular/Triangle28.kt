package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Triangle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Triangle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.034f, 4.158f)
            curveToRelative(0.857f, -1.542f, 3.076f, -1.542f, 3.933f, 0f)
            lineToRelative(8.965f, 16.127f)
            curveTo(25.858f, 21.952f, 24.653f, 24f, 22.747f, 24f)
            horizontalLineTo(5.254f)
            curveToRelative(-1.907f, 0f, -3.112f, -2.048f, -2.185f, -3.715f)
            lineToRelative(8.965f, -16.127f)
            close()
            moveToRelative(2.622f, 0.729f)
            curveToRelative(-0.286f, -0.514f, -1.025f, -0.514f, -1.311f, 0f)
            lineTo(4.38f, 21.014f)
            curveTo(4.009f, 21.681f, 4.49f, 22.5f, 5.254f, 22.5f)
            horizontalLineToRelative(17.493f)
            curveToRelative(0.762f, 0f, 1.244f, -0.82f, 0.874f, -1.486f)
            lineTo(14.656f, 4.887f)
            close()
        }
    }.build()
}
