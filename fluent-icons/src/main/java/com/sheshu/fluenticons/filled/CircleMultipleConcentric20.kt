package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleMultipleConcentric20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleMultipleConcentric20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 10f)
            curveToRelative(0f, -3.59f, 2.91f, -6.5f, 6.5f, -6.5f)
            reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
            reflectiveCurveToRelative(-2.91f, 6.5f, -6.5f, 6.5f)
            reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
            close()
            moveTo(10f, 2f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            close()
            moveToRelative(-3.5f, 8f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            close()
            moveTo(10f, 5f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
        }
    }.build()
}
