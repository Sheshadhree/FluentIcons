package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StreetSign24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StreetSign24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 4.5f)
            curveTo(8f, 3.12f, 9.12f, 2f, 10.5f, 2f)
            reflectiveCurveTo(13f, 3.12f, 13f, 4.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(3.379f)
            curveToRelative(0.596f, 0f, 1.169f, 0.237f, 1.59f, 0.659f)
            lineToRelative(2.811f, 2.81f)
            curveToRelative(0.293f, 0.294f, 0.293f, 0.768f, 0f, 1.061f)
            lineToRelative(-2.81f, 2.811f)
            curveTo(17.548f, 13.763f, 16.975f, 14f, 16.379f, 14f)
            horizontalLineTo(13f)
            verticalLineToRelative(6.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-2.5f)
            curveTo(8.56f, 22f, 8f, 21.44f, 8f, 20.75f)
            verticalLineTo(14f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 14f, 3f, 12.993f, 3f, 11.75f)
            verticalLineToRelative(-3.5f)
            curveTo(3f, 7.007f, 4.007f, 6f, 5.25f, 6f)
            horizontalLineTo(8f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(3.5f, 0f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineTo(6f)
            horizontalLineToRelative(2f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(-2f, 16f)
            horizontalLineToRelative(2f)
            verticalLineTo(14f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(6.5f)
            close()
        }
    }.build()
}
