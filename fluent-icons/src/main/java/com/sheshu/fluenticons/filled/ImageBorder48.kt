package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageBorder48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageBorder48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.348f, 25.098f)
            lineTo(14.5f, 31.947f)
            verticalLineTo(14.5f)
            horizontalLineToRelative(19f)
            verticalLineToRelative(17.447f)
            lineToRelative(-6.848f, -6.849f)
            curveToRelative(-1.465f, -1.464f, -3.84f, -1.464f, -5.304f, 0f)
            close()
            moveTo(29f, 16.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveToRelative(-4.116f, 10.366f)
            lineToRelative(6.634f, 6.634f)
            horizontalLineTo(16.482f)
            lineToRelative(6.634f, -6.634f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            close()
            moveTo(6f, 12.25f)
            curveTo(6f, 8.798f, 8.798f, 6f, 12.25f, 6f)
            horizontalLineToRelative(23.5f)
            curveTo(39.202f, 6f, 42f, 8.798f, 42f, 12.25f)
            verticalLineToRelative(23.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(8.798f, 42f, 6f, 39.202f, 6f, 35.75f)
            verticalLineToRelative(-23.5f)
            close()
            moveTo(13.25f, 12f)
            curveTo(12.56f, 12f, 12f, 12.56f, 12f, 13.25f)
            verticalLineToRelative(21.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(21.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-21.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-21.5f)
            close()
        }
    }.build()
}
