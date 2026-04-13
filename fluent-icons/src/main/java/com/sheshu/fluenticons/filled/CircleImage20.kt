package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleImage20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleImage20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 7f)
            horizontalLineToRelative(2.478f)
            curveTo(12.725f, 4.197f, 10.369f, 2f, 7.5f, 2f)
            curveTo(4.462f, 2f, 2f, 4.462f, 2f, 7.5f)
            curveToRelative(0f, 2.869f, 2.197f, 5.225f, 5f, 5.478f)
            verticalLineTo(10.5f)
            curveTo(7f, 8.567f, 8.567f, 7f, 10.5f, 7f)
            close()
            moveToRelative(0f, 1f)
            curveTo(9.12f, 8f, 8f, 9.12f, 8f, 10.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.51f, 0.152f, 0.983f, 0.414f, 1.379f)
            lineToRelative(3.172f, -3.172f)
            curveToRelative(0.78f, -0.78f, 2.047f, -0.78f, 2.828f, 0f)
            lineToRelative(3.172f, 3.172f)
            curveTo(17.848f, 16.483f, 18f, 16.009f, 18f, 15.5f)
            verticalLineToRelative(-5f)
            curveTo(18f, 9.12f, 16.88f, 8f, 15.5f, 8f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(5.5f, 3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(0.879f, 6.586f)
            lineToRelative(-3.172f, -3.172f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineTo(9.12f, 17.586f)
            curveTo(9.517f, 17.848f, 9.991f, 18f, 10.5f, 18f)
            horizontalLineToRelative(5f)
            curveToRelative(0.51f, 0f, 0.983f, -0.152f, 1.379f, -0.414f)
            close()
        }
    }.build()
}
