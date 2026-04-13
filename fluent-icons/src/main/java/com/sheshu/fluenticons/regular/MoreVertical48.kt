package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MoreVertical48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MoreVertical48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24.002f, 15.75f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            reflectiveCurveToRelative(1.455f, -3.25f, 3.25f, -3.25f)
            reflectiveCurveToRelative(3.25f, 1.455f, 3.25f, 3.25f)
            reflectiveCurveToRelative(-1.455f, 3.25f, -3.25f, 3.25f)
            close()
            moveToRelative(0f, 11.5f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            reflectiveCurveToRelative(1.455f, -3.25f, 3.25f, -3.25f)
            reflectiveCurveToRelative(3.25f, 1.455f, 3.25f, 3.25f)
            reflectiveCurveToRelative(-1.455f, 3.25f, -3.25f, 3.25f)
            close()
            moveToRelative(-3.25f, 8.25f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            reflectiveCurveToRelative(3.25f, -1.455f, 3.25f, -3.25f)
            reflectiveCurveToRelative(-1.455f, -3.25f, -3.25f, -3.25f)
            reflectiveCurveToRelative(-3.25f, 1.455f, -3.25f, 3.25f)
            close()
        }
    }.build()
}
