package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mail24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mail24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 8.608f)
            verticalLineToRelative(8.142f)
            curveToRelative(0f, 1.733f, -1.357f, 3.15f, -3.066f, 3.245f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.357f, -3.245f, -3.066f)
            lineTo(2f, 16.75f)
            verticalLineTo(8.608f)
            lineToRelative(9.652f, 5.056f)
            curveToRelative(0.218f, 0.114f, 0.478f, 0.114f, 0.696f, 0f)
            lineTo(22f, 8.608f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.685f, 0f, 3.07f, 1.282f, 3.234f, 2.924f)
            lineTo(12f, 12.154f)
            lineToRelative(-9.984f, -5.23f)
            curveToRelative(0.158f, -1.581f, 1.448f, -2.829f, 3.048f, -2.919f)
            lineTo(5.25f, 4f)
            horizontalLineToRelative(13.5f)
            horizontalLineToRelative(-13.5f)
            close()
        }
    }.build()
}
