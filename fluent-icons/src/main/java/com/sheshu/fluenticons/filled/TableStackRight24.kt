package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8f)
            horizontalLineToRelative(5f)
            verticalLineTo(3f)
            close()
            moveToRelative(0f, 6.5f)
            horizontalLineTo(3f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(1.5f, 5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(8f, 16f)
            horizontalLineTo(3f)
            verticalLineToRelative(1.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(8f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(1.5f, 5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(4.25f)
            curveToRelative(0f, 0.199f, -0.079f, 0.39f, -0.22f, 0.53f)
            curveToRelative(-0.14f, 0.141f, -0.33f, 0.22f, -0.53f, 0.22f)
            horizontalLineTo(9.5f)
            close()
            moveToRelative(0f, -13f)
            verticalLineTo(3f)
            horizontalLineToRelative(4.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(8f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(10f, 12.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(21f, 20.664f, 21f, 20.25f)
            verticalLineTo(3.75f)
            curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
            reflectiveCurveTo(19.5f, 3.336f, 19.5f, 3.75f)
            verticalLineToRelative(16.5f)
            close()
        }
    }.build()
}
