package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Filter32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Filter32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 9.25f)
            curveTo(3f, 8.56f, 3.56f, 8f, 4.25f, 8f)
            horizontalLineToRelative(23.5f)
            curveTo(28.44f, 8f, 29f, 8.56f, 29f, 9.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(4.25f)
            curveTo(3.56f, 10.5f, 3f, 9.94f, 3f, 9.25f)
            close()
            moveToRelative(4f, 7f)
            curveTo(7f, 15.56f, 7.56f, 15f, 8.25f, 15f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(8.25f)
            curveTo(7.56f, 17.5f, 7f, 16.94f, 7f, 16.25f)
            close()
            moveTo(12.25f, 22f)
            curveTo(11.56f, 22f, 11f, 22.56f, 11f, 23.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(20.44f, 22f, 19.75f, 22f)
            horizontalLineToRelative(-7.5f)
            close()
        }
    }.build()
}
