package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Flag48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flag48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 7.25f)
            curveTo(7.5f, 6.56f, 8.06f, 6f, 8.75f, 6f)
            horizontalLineToRelative(32.5f)
            curveToRelative(0.471f, 0f, 0.902f, 0.265f, 1.115f, 0.686f)
            curveToRelative(0.213f, 0.42f, 0.171f, 0.924f, -0.108f, 1.304f)
            lineTo(33.801f, 19.5f)
            lineToRelative(8.456f, 11.51f)
            curveToRelative(0.28f, 0.38f, 0.321f, 0.884f, 0.108f, 1.305f)
            curveTo(42.152f, 32.735f, 41.721f, 33f, 41.25f, 33f)
            horizontalLineTo(10f)
            verticalLineToRelative(9.75f)
            curveTo(10f, 43.44f, 9.44f, 44f, 8.75f, 44f)
            reflectiveCurveTo(7.5f, 43.44f, 7.5f, 42.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(10f, 30.5f)
            horizontalLineToRelative(28.78f)
            lineToRelative(-7.537f, -10.26f)
            curveToRelative(-0.324f, -0.44f, -0.324f, -1.04f, 0f, -1.48f)
            lineTo(38.78f, 8.5f)
            horizontalLineTo(10f)
            verticalLineToRelative(22f)
            close()
        }
    }.build()
}
