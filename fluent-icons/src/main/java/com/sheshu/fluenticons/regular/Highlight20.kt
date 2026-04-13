package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Highlight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Highlight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(3.776f, 2f, 4f, 2.224f, 4f, 2.5f)
            verticalLineToRelative(4f)
            curveTo(4f, 6.776f, 4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(11f)
            curveTo(15.776f, 7f, 16f, 6.776f, 16f, 6.5f)
            verticalLineToRelative(-4f)
            curveTo(16f, 2.224f, 16.224f, 2f, 16.5f, 2f)
            reflectiveCurveTo(17f, 2.224f, 17f, 2.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.653f, -0.417f, 1.209f, -1f, 1.415f)
            verticalLineTo(9f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            verticalLineToRelative(2.073f)
            curveToRelative(0f, 0.758f, -0.428f, 1.45f, -1.106f, 1.789f)
            lineToRelative(-6.17f, 3.085f)
            curveToRelative(-0.155f, 0.078f, -0.34f, 0.07f, -0.487f, -0.022f)
            curveTo(6.09f, 17.835f, 6f, 17.673f, 6f, 17.5f)
            verticalLineTo(11f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(7.915f)
            curveTo(3.417f, 7.709f, 3f, 7.153f, 3f, 6.5f)
            verticalLineToRelative(-4f)
            curveTo(3f, 2.224f, 3.224f, 2f, 3.5f, 2f)
            close()
            moveTo(5f, 8f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(8f)
            horizontalLineTo(5f)
            close()
            moveToRelative(2f, 3f)
            verticalLineToRelative(5.691f)
            lineToRelative(5.447f, -2.724f)
            curveTo(12.786f, 13.798f, 13f, 13.452f, 13f, 13.073f)
            verticalLineTo(11f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
