package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SquareShadow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SquareShadow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.875f, 2f)
            curveTo(15.601f, 2f, 17f, 3.4f, 17f, 5.125f)
            verticalLineTo(7f)
            horizontalLineToRelative(1.875f)
            curveTo(20.601f, 7f, 22f, 8.4f, 22f, 10.125f)
            verticalLineToRelative(8.75f)
            curveTo(22f, 20.601f, 20.6f, 22f, 18.875f, 22f)
            horizontalLineToRelative(-8.75f)
            curveTo(8.399f, 22f, 7f, 20.6f, 7f, 18.875f)
            verticalLineTo(17f)
            horizontalLineTo(5.125f)
            curveTo(3.399f, 17f, 2f, 15.6f, 2f, 13.875f)
            verticalLineToRelative(-8.75f)
            curveTo(2f, 3.399f, 3.4f, 2f, 5.125f, 2f)
            horizontalLineToRelative(8.75f)
            close()
            moveTo(5.25f, 3.5f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-8.5f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
