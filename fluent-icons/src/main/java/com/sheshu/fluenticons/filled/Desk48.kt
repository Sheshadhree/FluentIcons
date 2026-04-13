package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Desk48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Desk48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.25f, 8f)
            curveTo(5.903f, 8f, 4f, 9.903f, 4f, 12.25f)
            verticalLineTo(16f)
            horizontalLineToRelative(37.5f)
            verticalLineToRelative(22.75f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveTo(44f, 39.44f, 44f, 38.75f)
            verticalLineToRelative(-26.5f)
            curveTo(44f, 9.903f, 42.097f, 8f, 39.75f, 8f)
            horizontalLineTo(8.25f)
            close()
            moveTo(24f, 18.5f)
            horizontalLineTo(4f)
            verticalLineToRelative(15.25f)
            curveTo(4f, 37.202f, 6.798f, 40f, 10.25f, 40f)
            horizontalLineToRelative(7.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineTo(18.5f)
            close()
            moveToRelative(-14f, 6.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            close()
        }
    }.build()
}
