package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 5.25f)
            curveTo(6.5f, 4.56f, 7.06f, 4f, 7.75f, 4f)
            reflectiveCurveTo(9f, 4.56f, 9f, 5.25f)
            verticalLineToRelative(37.5f)
            curveTo(9f, 43.44f, 8.44f, 44f, 7.75f, 44f)
            reflectiveCurveTo(6.5f, 43.44f, 6.5f, 42.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(15.75f, 26f)
            curveToRelative(-2.347f, 0f, -4.25f, 1.903f, -4.25f, 4.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 2.347f, 1.903f, 4.25f, 4.25f, 4.25f)
            horizontalLineToRelative(15f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -2.347f, -1.903f, -4.25f, -4.25f, -4.25f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(11.5f, 12.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 2.347f, 1.903f, 4.25f, 4.25f, 4.25f)
            horizontalLineTo(38f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineToRelative(-5.5f)
            curveTo(42.25f, 9.903f, 40.347f, 8f, 38f, 8f)
            horizontalLineTo(15.75f)
            curveToRelative(-2.347f, 0f, -4.25f, 1.903f, -4.25f, 4.25f)
            close()
        }
    }.build()
}
