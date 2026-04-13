package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StackVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StackVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(20f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3.75f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(6.25f)
            curveTo(5.56f, 15f, 5f, 15.56f, 5f, 16.25f)
            verticalLineTo(20f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(2f, 7f)
            curveTo(5.385f, 13.088f, 5.807f, 13f, 6.25f, 13f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.443f, 0f, 0.865f, 0.089f, 1.25f, 0.25f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(6.25f)
            curveTo(5.56f, 10f, 5f, 10.56f, 5f, 11.25f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(14f, -7f)
            curveTo(19f, 5.56f, 18.44f, 5f, 17.75f, 5f)
            horizontalLineTo(6.25f)
            curveTo(5.56f, 5f, 5f, 5.56f, 5f, 6.25f)
            verticalLineToRelative(2f)
            curveTo(5.385f, 8.088f, 5.807f, 8f, 6.25f, 8f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.443f, 0f, 0.865f, 0.089f, 1.25f, 0.25f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
