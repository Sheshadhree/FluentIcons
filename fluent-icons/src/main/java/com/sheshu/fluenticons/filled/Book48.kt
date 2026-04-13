package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Book48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Book48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.25f, 4f)
            curveTo(10.798f, 4f, 8f, 6.798f, 8f, 10.25f)
            verticalLineToRelative(27.5f)
            curveTo(8f, 41.202f, 10.798f, 44f, 14.25f, 44f)
            horizontalLineToRelative(24.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-24.5f)
            curveToRelative(-1.814f, 0f, -3.328f, -1.288f, -3.675f, -3f)
            horizontalLineTo(37.75f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-26f)
            curveTo(40f, 6.798f, 37.202f, 4f, 33.75f, 4f)
            horizontalLineToRelative(-19.5f)
            close()
            moveTo(14f, 12.25f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-15.5f)
            curveTo(15.007f, 17f, 14f, 15.993f, 14f, 14.75f)
            verticalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
