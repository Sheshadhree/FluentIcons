package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailMultiple28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailMultiple28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 9.608f)
            verticalLineToRelative(8.142f)
            curveToRelative(0f, 1.733f, -1.357f, 3.15f, -3.066f, 3.245f)
            lineTo(19.75f, 21f)
            horizontalLineTo(6.25f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.357f, -3.245f, -3.066f)
            lineTo(3f, 17.75f)
            verticalLineTo(9.608f)
            lineToRelative(9.652f, 5.056f)
            curveToRelative(0.218f, 0.114f, 0.478f, 0.114f, 0.696f, 0f)
            lineTo(23f, 9.608f)
            close()
            moveTo(6.25f, 5f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.685f, 0f, 3.07f, 1.282f, 3.234f, 2.924f)
            lineTo(13f, 13.154f)
            lineToRelative(-9.984f, -5.23f)
            curveToRelative(0.158f, -1.581f, 1.448f, -2.829f, 3.048f, -2.919f)
            lineTo(6.25f, 5f)
            close()
            moveTo(6.012f, 22f)
            curveToRelative(0.577f, 0.902f, 1.588f, 1.5f, 2.739f, 1.5f)
            horizontalLineToRelative(11.5f)
            curveToRelative(2.9f, 0f, 5.25f, -2.35f, 5.25f, -5.25f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -1.15f, -0.598f, -2.162f, -1.5f, -2.74f)
            verticalLineToRelative(10.24f)
            curveToRelative(0f, 2.071f, -1.68f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.01f)
            close()
        }
    }.build()
}
