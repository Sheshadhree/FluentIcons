package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DesktopArrowDown32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopArrowDown32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.5f, 16f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveTo(31f, 4.358f, 27.642f, 1f, 23.5f, 1f)
            curveTo(19.358f, 1f, 16f, 4.358f, 16f, 8.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            close()
            moveToRelative(1f, -12.25f)
            verticalLineToRelative(7.69f)
            lineToRelative(2.72f, -2.72f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-4f, -4f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(23f, 11.44f)
            verticalLineTo(3.75f)
            curveTo(23f, 3.336f, 23.336f, 3f, 23.75f, 3f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            close()
            moveToRelative(-1f, 13.75f)
            curveToRelative(2.555f, 0f, 4.862f, -1.065f, 6.5f, -2.775f)
            verticalLineToRelative(7.025f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-6.744f)
            verticalLineToRelative(2.001f)
            horizontalLineToRelative(2.998f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.551f, -0.448f, 0.999f, -1f, 0.999f)
            horizontalLineTo(9.012f)
            curveToRelative(-0.552f, 0f, -1f, -0.447f, -1f, -1f)
            curveToRelative(0f, -0.551f, 0.448f, -0.999f, 1f, -0.999f)
            horizontalLineToRelative(2.998f)
            verticalLineTo(25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 25f, 2f, 23.545f, 2f, 21.75f)
            verticalLineTo(6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineToRelative(11.125f)
            curveTo(15.2f, 4.52f, 14.5f, 6.429f, 14.5f, 8.5f)
            curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
            close()
            moveTo(14.01f, 25f)
            verticalLineToRelative(2.001f)
            horizontalLineToRelative(3.996f)
            verticalLineTo(25f)
            horizontalLineTo(14.01f)
            close()
        }
    }.build()
}
