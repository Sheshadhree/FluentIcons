package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Doctor28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Doctor28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.75f, 2.998f)
            curveTo(9.784f, 2.998f, 9f, 3.781f, 9f, 4.748f)
            verticalLineTo(9f)
            horizontalLineTo(4.75f)
            curveTo(3.784f, 9f, 3f, 9.784f, 3f, 10.75f)
            verticalLineToRelative(6.5f)
            curveTo(3f, 18.216f, 3.784f, 19f, 4.75f, 19f)
            horizontalLineTo(9f)
            verticalLineToRelative(4.252f)
            curveToRelative(0f, 0.967f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.783f, 1.75f, -1.75f)
            verticalLineTo(19f)
            horizontalLineToRelative(4.25f)
            curveToRelative(0.966f, 0f, 1.75f, -0.783f, 1.75f, -1.75f)
            verticalLineToRelative(-6.5f)
            curveTo(25f, 9.784f, 24.216f, 9f, 23.25f, 9f)
            horizontalLineTo(19f)
            verticalLineTo(4.75f)
            curveToRelative(0f, -0.967f, -0.784f, -1.751f, -1.75f, -1.751f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
