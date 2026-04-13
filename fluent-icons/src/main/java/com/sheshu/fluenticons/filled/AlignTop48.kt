package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignTop48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignTop48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 6.5f)
            curveTo(4.56f, 6.5f, 4f, 7.06f, 4f, 7.75f)
            reflectiveCurveTo(4.56f, 9f, 5.25f, 9f)
            horizontalLineToRelative(37.5f)
            curveTo(43.44f, 9f, 44f, 8.44f, 44f, 7.75f)
            reflectiveCurveTo(43.44f, 6.5f, 42.75f, 6.5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(26f, 15.75f)
            curveToRelative(0f, -2.347f, 1.903f, -4.25f, 4.25f, -4.25f)
            horizontalLineToRelative(5.5f)
            curveToRelative(2.347f, 0f, 4.25f, 1.903f, 4.25f, 4.25f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-5.5f)
            curveTo(27.903f, 35f, 26f, 33.097f, 26f, 30.75f)
            verticalLineToRelative(-15f)
            close()
            moveTo(12.25f, 11.5f)
            horizontalLineToRelative(5.5f)
            curveToRelative(2.347f, 0f, 4.25f, 1.903f, 4.25f, 4.25f)
            verticalLineTo(38f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-5.5f)
            curveTo(9.903f, 42.25f, 8f, 40.347f, 8f, 38f)
            verticalLineTo(15.75f)
            curveToRelative(0f, -2.347f, 1.903f, -4.25f, 4.25f, -4.25f)
            close()
        }
    }.build()
}
