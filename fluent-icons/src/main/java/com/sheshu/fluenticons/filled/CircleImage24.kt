package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleImage24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleImage24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.25f, 8f)
            horizontalLineToRelative(3.68f)
            curveTo(15.443f, 4.608f, 12.526f, 2f, 9f, 2f)
            curveTo(5.134f, 2f, 2f, 5.134f, 2f, 9f)
            curveToRelative(0f, 3.527f, 2.608f, 6.444f, 6f, 6.93f)
            verticalLineToRelative(-3.68f)
            curveTo(8f, 9.903f, 9.903f, 8f, 12.25f, 8f)
            close()
            moveToRelative(0f, 1f)
            curveTo(10.455f, 9f, 9f, 10.455f, 9f, 12.25f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.626f, 0.177f, 1.21f, 0.483f, 1.706f)
            lineToRelative(4.25f, -4.249f)
            curveToRelative(0.976f, -0.976f, 2.558f, -0.976f, 3.535f, 0f)
            lineToRelative(4.249f, 4.25f)
            curveTo(21.823f, 19.96f, 22f, 19.375f, 22f, 18.75f)
            verticalLineToRelative(-6.5f)
            curveTo(22f, 10.455f, 20.545f, 9f, 18.75f, 9f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(8.206f, 12.517f)
            lineToRelative(-4.249f, -4.25f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-4.25f, 4.25f)
            curveTo(11.04f, 21.823f, 11.625f, 22f, 12.25f, 22f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.626f, 0f, 1.21f, -0.177f, 1.706f, -0.483f)
            close()
            moveTo(19.25f, 13f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            close()
        }
    }.build()
}
