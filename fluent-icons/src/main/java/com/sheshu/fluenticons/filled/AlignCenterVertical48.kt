package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignCenterVertical48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterVertical48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.75f, 44f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(40f)
            horizontalLineToRelative(-6.25f)
            curveTo(13.903f, 40f, 12f, 38.097f, 12f, 35.75f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -2.347f, 1.903f, -4.25f, 4.25f, -4.25f)
            horizontalLineToRelative(6.25f)
            verticalLineToRelative(-4f)
            horizontalLineTo(12.25f)
            curveTo(9.903f, 22f, 8f, 20.097f, 8f, 17.75f)
            verticalLineToRelative(-5.5f)
            curveTo(8f, 9.903f, 9.903f, 8f, 12.25f, 8f)
            horizontalLineTo(22.5f)
            verticalLineTo(5.25f)
            curveTo(22.5f, 4.56f, 23.06f, 4f, 23.75f, 4f)
            reflectiveCurveTo(25f, 4.56f, 25f, 5.25f)
            verticalLineTo(8f)
            horizontalLineToRelative(10.75f)
            curveTo(38.097f, 8f, 40f, 9.903f, 40f, 12.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineTo(25f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(6.75f)
            curveToRelative(2.347f, 0f, 4.25f, 1.903f, 4.25f, 4.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineTo(25f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            close()
        }
    }.build()
}
