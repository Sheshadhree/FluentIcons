package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Headphones48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Headphones48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 6.5f)
            curveTo(14.335f, 6.5f, 6.5f, 14.335f, 6.5f, 24f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(9.25f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-6f)
            curveTo(6.574f, 44f, 4f, 41.426f, 4f, 38.25f)
            verticalLineTo(24f)
            curveTo(4f, 12.954f, 12.954f, 4f, 24f, 4f)
            reflectiveCurveToRelative(20f, 8.954f, 20f, 20f)
            verticalLineToRelative(14.25f)
            curveToRelative(0f, 3.176f, -2.574f, 5.75f, -5.75f, 5.75f)
            horizontalLineToRelative(-6f)
            curveTo(31.56f, 44f, 31f, 43.44f, 31f, 42.75f)
            verticalLineToRelative(-13.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(9.25f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -9.665f, -7.835f, -17.5f, -17.5f, -17.5f)
            close()
        }
    }.build()
}
