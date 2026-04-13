package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AppRecent24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AppRecent24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 19.75f)
            curveToRelative(0f, 1.19f, -0.925f, 2.166f, -2.096f, 2.245f)
            lineTo(15.75f, 22f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-1.19f, 0f, -2.166f, -0.925f, -2.245f, -2.096f)
            lineTo(6f, 19.75f)
            verticalLineTo(4.25f)
            curveToRelative(0f, -1.19f, 0.925f, -2.166f, 2.096f, -2.245f)
            lineTo(8.25f, 2f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.19f, 0f, 2.166f, 0.925f, 2.245f, 2.096f)
            lineTo(18f, 4.25f)
            verticalLineToRelative(15.5f)
            close()
            moveTo(19f, 5f)
            horizontalLineToRelative(0.75f)
            curveToRelative(1.19f, 0f, 2.166f, 0.925f, 2.245f, 2.096f)
            lineTo(22f, 7.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.19f, -0.925f, 2.166f, -2.096f, 2.245f)
            lineTo(19.75f, 19f)
            horizontalLineTo(19f)
            verticalLineTo(5f)
            close()
            moveTo(5f, 19f)
            horizontalLineTo(4.25f)
            curveToRelative(-1.19f, 0f, -2.166f, -0.925f, -2.245f, -2.096f)
            lineTo(2f, 16.75f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -1.19f, 0.925f, -2.166f, 2.096f, -2.245f)
            lineTo(4.25f, 5f)
            horizontalLineTo(5f)
            verticalLineToRelative(14f)
            close()
        }
    }.build()
}
