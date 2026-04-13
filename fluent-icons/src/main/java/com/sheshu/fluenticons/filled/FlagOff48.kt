package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagOff48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagOff48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(31.232f, 33f)
            lineToRelative(10.634f, 10.634f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-37.5f, -37.5f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineTo(7.5f, 9.268f)
            verticalLineTo(42.75f)
            curveTo(7.5f, 43.44f, 8.06f, 44f, 8.75f, 44f)
            reflectiveCurveTo(10f, 43.44f, 10f, 42.75f)
            verticalLineTo(33f)
            horizontalLineToRelative(21.232f)
            close()
            moveToRelative(10.018f, 0f)
            horizontalLineToRelative(-3.653f)
            lineToRelative(-27f, -27f)
            horizontalLineTo(41.25f)
            curveToRelative(0.471f, 0f, 0.902f, 0.265f, 1.115f, 0.686f)
            curveToRelative(0.213f, 0.42f, 0.171f, 0.924f, -0.108f, 1.304f)
            lineTo(33.801f, 19.5f)
            lineToRelative(8.456f, 11.51f)
            curveToRelative(0.28f, 0.38f, 0.321f, 0.884f, 0.108f, 1.305f)
            curveTo(42.152f, 32.735f, 41.721f, 33f, 41.25f, 33f)
            close()
        }
    }.build()
}
