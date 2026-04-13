package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Stop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Stop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 3f)
            curveTo(3.784f, 3f, 3f, 3.784f, 3f, 4.75f)
            verticalLineToRelative(14.5f)
            curveTo(3f, 20.216f, 3.784f, 21f, 4.75f, 21f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(4.75f)
            curveTo(21f, 3.784f, 20.216f, 3f, 19.25f, 3f)
            horizontalLineTo(4.75f)
            close()
        }
    }.build()
}
