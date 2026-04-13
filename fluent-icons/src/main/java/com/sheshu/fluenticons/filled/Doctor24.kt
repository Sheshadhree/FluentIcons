package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Doctor24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Doctor24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3.25f)
            curveTo(9.034f, 3.25f, 8.25f, 4.034f, 8.25f, 5f)
            verticalLineToRelative(3.25f)
            horizontalLineTo(5f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(3.25f)
            verticalLineTo(19f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(4f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-3.25f)
            horizontalLineTo(19f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-3.25f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
