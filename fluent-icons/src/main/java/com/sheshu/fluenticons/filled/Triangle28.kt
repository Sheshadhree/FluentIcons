package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Triangle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Triangle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.967f, 4.158f)
            curveToRelative(-0.857f, -1.542f, -3.075f, -1.542f, -3.933f, 0f)
            lineTo(3.068f, 20.285f)
            curveTo(2.143f, 21.952f, 3.349f, 24f, 5.255f, 24f)
            horizontalLineToRelative(17.493f)
            curveToRelative(1.906f, 0f, 3.111f, -2.048f, 2.185f, -3.715f)
            lineTo(15.967f, 4.158f)
            close()
        }
    }.build()
}
