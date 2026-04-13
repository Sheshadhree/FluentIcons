package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RectangleLandscape48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RectangleLandscape48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 13.25f)
            curveTo(4f, 10.35f, 6.35f, 8f, 9.25f, 8f)
            horizontalLineToRelative(29.5f)
            curveToRelative(2.9f, 0f, 5.25f, 2.35f, 5.25f, 5.25f)
            verticalLineToRelative(21.5f)
            curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
            horizontalLineTo(9.25f)
            curveTo(6.35f, 40f, 4f, 37.65f, 4f, 34.75f)
            verticalLineToRelative(-21.5f)
            close()
        }
    }.build()
}
