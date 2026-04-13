package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Shield24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Shield24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.75f)
            curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
            curveToRelative(2.663f, 0f, 5.258f, -0.944f, 7.8f, -2.85f)
            curveToRelative(0.267f, -0.2f, 0.633f, -0.2f, 0.9f, 0f)
            curveTo(14.992f, 4.056f, 17.587f, 5f, 20.25f, 5f)
            curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
            verticalLineTo(11f)
            curveToRelative(0f, 5.001f, -2.958f, 8.676f, -8.725f, 10.948f)
            curveToRelative(-0.177f, 0.07f, -0.373f, 0.07f, -0.55f, 0f)
            curveTo(5.958f, 19.676f, 3f, 16f, 3f, 11f)
            verticalLineTo(5.75f)
            close()
            moveToRelative(1.5f, 0.728f)
            verticalLineTo(11f)
            curveToRelative(0f, 4.256f, 2.453f, 7.379f, 7.5f, 9.442f)
            curveToRelative(5.047f, -2.063f, 7.5f, -5.186f, 7.5f, -9.442f)
            verticalLineTo(6.478f)
            curveToRelative(-2.577f, -0.152f, -5.08f, -1.09f, -7.5f, -2.8f)
            curveToRelative(-2.42f, 1.71f, -4.923f, 2.648f, -7.5f, 2.8f)
            close()
        }
    }.build()
}
